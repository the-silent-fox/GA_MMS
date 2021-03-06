/***********************************************/
/** PROBLEM SOLVING                           **/
/** UNIVERSITY OF LUXEMBOURG                  **/
/** DEC 2010                                  **/
/** Prof. Pascal Bouvry                       **/
/** Assistant Patricia Ruiz                   **/
/** Assistant Cesar Diaz                      **/
/***********************************************/ 


/*
Intelligent Systems - Problem Solving project
Authors:  Gabriele Sartor
          Morgan Gautherot 
*/

import java.util.Random;
import java.io.* ;

/*
This class aims to represent the chromosome object in the Minimum Makespan problem.
*/

public class Chromosome implements Serializable
{
  private int alleles[];		// Allele vector
  private int  L;			      // Length of the allele vector
  private static Random r = new Random(); 


  // CONSTRUCTOR - FILL UP THE CONTENTS
  /*
  Creates a chromosome for a number "length" of jobs to be assigned to a number "machinesNum" of machines.
  Assignments between jobs and machines are created randomly
  */
  public Chromosome(int length, int machinesNum)
  {
    alleles = new int[length];
    L = length;
    for (int i=0; i<length; i++){
      alleles[i] = r.nextInt(machinesNum);
    }
  }

  public void set_allele(int index, int value)
  {
    alleles[index] = value;
  }


  public int get_allele(int index)
  {
    return alleles[index];
  }


  public void print()
  {
    for(int i=0; i<L; i++)
    System.out.println(alleles[i]);
  }

}

// END OF CLASS: Chromosome
