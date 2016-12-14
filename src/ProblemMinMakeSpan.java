

public class ProblemMinMakeSpan extends Problem{
    float [][]jobsMatrix;
    
    public ProblemMinMakeSpan() {
      try{
        jobsMatrix = ReadTasks.matrixFromFile();
      }catch(Exception e){ System.out.println("Error IO"); }
    }

    public double Evaluate(Individual Indiv) {
      return MinMakeSpan(Indiv) ;
    }


  //    PRIVATE METHODS

  private double MinMakeSpan(Individual indiv)
  {
    double f[] = new double[16];
    double max = 0.0;
     
    for(int i=0; i<CL; i++) {
      f[(indiv.get_chromosome()).get_allele(i)]  += jobsMatrix[i][(indiv.get_chromosome()).get_allele(i)];
    }
    
    for(int i=0; i<16; i++) {
      if(max<f[i])
        max = f[i];
    }

    return -max;
  }

}