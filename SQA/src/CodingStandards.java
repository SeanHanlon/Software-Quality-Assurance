/*
 * Classname
 * 
 * Version information
 *
 * Date
 * 
 * Copyright notice
 */
public class CodingStandards {
	int level; // indentation level
	int size;  // size of table

	/*
	 * Here is a block comment.
	 * This is to be placed above a method.
	 */
	void myMethod() {
	    int int1 = 0;         // beginning of method block

	    if (condition) {
	        int int2 = 0;     // beginning of "if" block
	       // ...
	    }
	}
	
	if (condition) {
	    //statements;
	}
	
	if (condition) {
	    statements;
	} else {
	    statements;
	}
	
	for (initialization; condition; update) {
	    statements;
	}
	
	while (condition) {
	    statements;
	}
	
	do {
	    statements;
	} while (condition);
	
	switch (condition) {
	case ABC:
	    statements;
	    /* falls through */
	case DEF:
	    statements;
	    break;
	case XYZ:
	    statements;
	    break;
	default:
	    statements;
	    break;
	}

	try {
	    statements;
	} catch (ExceptionClass e) {
	     statements;
	}
}
