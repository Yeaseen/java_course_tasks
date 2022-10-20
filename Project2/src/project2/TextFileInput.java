package project2;

//TextFileInput.java
//Copyright (c) 2000, 2005 Dorothy L. Nixon.  All rights reserved.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

/**
* Simplified buffered character input
* stream from an input text file.
* Manages an input text file,
* handling all IOExceptions by generating
* RuntimeExcpetions (run-time error
* messages).
*
* If the text file cannot be created,
* a RuntimeException is thrown,
* which by default results an an
* error message being printed to
* the standard error stream.
*
* @author D. Nixon
*/
public class TextFileInput  {

/**  Name of text file  */
private String filename;

/**  Buffered character stream from file  */
private BufferedReader br;  

/**  Count of lines read so far.  */
private int lineCount = 0;

/**
 * Creates a buffered character input
 * strea, for the specified text file.
 *
 * @param filename the input text file.
 * @exception RuntimeException if an
 *          IOException is thrown when
 *          attempting to open the file.
 */
public TextFileInput(String filename)
{
   this.filename = filename;
   try  {
      br = new BufferedReader(
               new InputStreamReader(
                   new FileInputStream(filename)));
   } catch ( IOException ioe )  {
      throw new RuntimeException(ioe);
   }  // catch
}  // constructor

/**
 * Closes this character input stream.
 * No more characters can be read from
 * this TextFileInput once it is closed.
 * @exception NullPointerException if
 *        the file is already closed.
 * @exception RuntimeException if an
 *       IOException is thrown when
 *       closing the file.
 */
public void close()
{
   try  {
      br.close();
      br = null;
   } catch ( NullPointerException npe )  {
      throw new NullPointerException(
                     filename + "already closed.");
   } catch ( IOException ioe )  {
      throw new RuntimeException(ioe);
   }  // catch
}  // method close

/**
 * Reads a line of text from the file and
 * positions cursor at 0 for the next line.
 * Reads from the current cursor position
 * to end of line.
 * Implementation does not invoke read.
 *
 * @return the line of text, with
 *         end-of-line marker deleted.
 * @exception RuntimeException if an
 *          IOException is thrown when
 *          attempting to read from the file.
 */
public String readLine()
{
   return readLineOriginal();
}  // method readLine()

/**
 * Returns a count of lines
 * read from the file so far.
 */
public int getLineCount()  { return lineCount; }

/**
 * Tests whether the specified character is equal,
 * ignoring case, to one of the specified options.
 *
 * @param toBeChecked the character to be tested.
 * @param options a set of characters
 * @return true if <code>toBeChecked</code> is
 *         equal, ignoring case, to one of the
 *         <code>options</code>, false otherwise.
 */
public static boolean isOneOf(char toBeChecked,
                              char[] options)
{
   boolean oneOf = false;
   for ( int i = 0; i < options.length && !oneOf; i++ )
      if ( Character.toUpperCase(toBeChecked)
                == Character.toUpperCase(options[i]) )
         oneOf = true;
   return oneOf;
}  // method isOneOf(char, char[])

/**
 * Tests whether the specified string is one of the
 * specified options.  Checks whether the string
 * contains the same sequence of characters (ignoring
 * case) as one of the specified options.
 *
 * @param toBeChecked the String to be tested
 * @param options a set of Strings
 * @return true if <code>toBeChecked</code>
 *         contains the same sequence of
 *         characters, ignoring case, as one of the
 *         <code>options</code>, false otherwise.
 */
public static boolean isOneOf(String toBeChecked,
                              String[] options)
{
   boolean oneOf = false;
   for ( int i = 0; i < options.length && !oneOf; i++ )
      if ( toBeChecked.equalsIgnoreCase(options[i]) )
         oneOf = true;
   return oneOf;
}  // method isOneOf(String, String[])

/**
 * Reads a line from the text file and ensures that
 * it matches one of a specified set of options.
 *
 * @param options array of permitted replies
 *
 * @return the line of text, if it contains the same
 *         sequence of characters (ignoring case for
 *         letters) as one of the specified options,
 *         null otherwise.
 * @exception RuntimeException if the line of text
 *         does not match any of the specified options,
 *         or if an IOException is thrown when reading
 *         from the file.
 * @exception NullPointerException if no options are
 *         provided, or if the end of the file has been
 *         reached.
 */
public String readSelection(String[] options)
{
   if ( options == null || options.length == 0 )
      throw new NullPointerException(
                         "No options provided for "
                         + " selection to be read in file "
                         + filename + ", line " 
                         + (lineCount + 1) + ".");

   String answer = readLine();

   if ( answer == null )
      throw new NullPointerException(
                         "End of file "
                         + filename + "has been reached.");

   if ( !TextFileInput.isOneOf(answer, options) )  {
      String optionString = options[0];
      for ( int i = 1; i < options.length; i++ )
         optionString += ", " + options[i];
      throw new RuntimeException("File " + filename
                         + ", line " + lineCount
                         + ": \"" + answer
                         + "\" not one of "
                         + optionString + ".");
   }  // if
   return answer;
}  // method readSelection

/**
 * Reads a line from the text file and ensures that
 * it matches, ignoring case, one of "Y", "N", "yes",
 * "no", "1", "0", "T", "F", "true", or "false".
 * There must be no additional characters on the line.
 *
 * @return <code>true</code> if the line matches
 *        "Y", "yes", "1" "T", or "true".
 *        <code>false</code> if the line matches
 *        "N", "no", "0", "F", or "false".
 * @exception RuntimeException if the line of text
 *        does not match one of "Y", "N", "yes",
 *        "no", "1", "0", "T", "F", "true", or "false",
 *        or if an IOException is thrown when reading
 *        from the file.
 * @exception NullPointerException if the end of the
 *        file has been reached.
 */
public boolean readBooleanSelection()
{
   String[] options = {"Y", "N", "yes", "no", "1", "0",
                       "T", "F", "true", "false"};
   String answer = readSelection(options);
   return isOneOf(answer,
                  new String[] {"Y", "yes", "1", "T", "true"} );
}  // method askUserYesNo

/**
 * Reads a line of text from the file and
 * increments line count.  (This method
 * is called by public readLine and is
 * final to facilitate avoidance of side
 * effects when public readLine is overridden.)
 *
 * @return the line of text, with
 *         end-of-line marker deleted.
 * @exception RuntimeException if an
 *          IOException is thrown when
 *          attempting to read from the file.
 */
protected final String readLineOriginal()
{
    try  {
       if ( br == null )
          throw new RuntimeException(
                             "Cannot read from closed file "
                             + filename + ".");
       String line = br.readLine();
       if ( line != null )
          lineCount++;
       return line;
    } catch (IOException ioe)  {
       throw new RuntimeException(ioe);
    }  // catch
}  // method readLineOriginal
}  // class TextFileInput
