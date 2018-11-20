package analyzer;

import fillers.*;
import sorters.*;

public interface ObjectSaver {
    ArrSrt arS = new ArrSrt();
    BubSrtSta bSta = new BubSrtSta();
    BubSrtEnd bEnd = new BubSrtEnd();
    MergeSrt meSrt = new MergeSrt();
    QuickSrt quSrt = new QuickSrt();

    ArrGR arrGr = new ArrGR();
    MinMax MiMa = new MinMax();
    MinMaxRX MiMaRx = new MinMaxRX();
    MaxMin MaMi = new MaxMin();

}
