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

import java.io.* ;

/*
This class aims to represent an individual in the Minimum Makespan problem.
*/

public class Individual implements Serializable
{
  private Chromosome chrom;
  private int        L;
  private int        M;
  private double     fitness;

  public Individual(int L, int M)
  {
     chrom   = new Chromosome(L, M);
     fitness = 0.0;
     this.L  = L;
     this.M  = M;
  }

  public void print()
  {
     chrom.print();
     System.out.print("   ");
     System.out.println(fitness); 
  }

  public int get_length()
  {
     return L;
  }

  public int get_numOfMachines()
  {
     return M;
  }

  public void set_fitness(double fit)
  {
     fitness = fit;
  }

  public double get_fitness()
  {
     return fitness;
  }

  public void set_allele(int index, int value)
  {
     chrom.set_allele(index,value);
  }

  public int get_allele(int index)
  {
     return chrom.get_allele(index);
  }

  //Copy the chromosome source in the position of the chromosome "destination"
  private void copy(Chromosome source, Chromosome destination)
  {
     for (int i=0; i<L; i++)
     {
         destination.set_allele(i,source.get_allele(i));
     }
  }

  //Put the values of the individual I in this individual
  public void assign(Individual I)
  {
    copy(I.get_chromosome(),chrom);
    fitness = I.get_fitness();
    L       = I.get_length();
  }

  public void set_chrom(Chromosome ch)
  {
     copy(ch,chrom);
  }

  public Chromosome get_chromosome()
  {
     return chrom;
  }

}
// END OF CLASS: Individual
