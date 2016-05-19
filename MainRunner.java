import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class MainRunner 
{
    public static void main( String[] args) throws Exception 
    {
//    	File f = new File(System.getProperty("user.dir") + "/scripts/calc_afrate.m");
//    	FileInputStream fis = null;
//    	
//    	int content;
//    	String strContent = "";
//    	try{
//    		fis = new FileInputStream(f);
//    		while((content = fis.read()) != -1) 
//			{
//    			strContent += (char) content;
//			}
//    	}
//    	catch (IOException e){
//    		e.printStackTrace();
//    	}
//    	finally{
//    		try{
//    			if (fis != null)
//    				fis.close();
//    		}
//    		catch (IOException ex){
//    			ex.printStackTrace();
//    		}
//    	}
    	
        ANTLRInputStream input = new ANTLRInputStream("function [f1, f2, f3, f4] = calc_afrate(stateoutfile, Tsim, tR)");

        MATLABLexer lexer = new MATLABLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MATLABParser parser = new MATLABParser(tokens);
        ParseTree tree = parser.assignment(); 
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}