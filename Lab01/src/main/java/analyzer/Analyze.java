package analyzer;

import static fillers.Fillers.*;

public class Analyze implements ObjectSaver {

    public void anArrSrtGR() {
        long start = System.nanoTime();
        arS.srtArr(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anArrSrtMiMa() {
        long start = System.nanoTime();
        arS.srtArr(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anArrSrtMiMaRx() {
        long start = System.nanoTime();
        arS.srtArr(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anArrSrtMaMi() {
        long start = System.nanoTime();
        arS.srtArr(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anBubStaGR() {
        long start = System.nanoTime();
        bSta.srtBubSta(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubStaMiMa() {
        long start = System.nanoTime();
        bSta.srtBubSta(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubStaMiMaRx() {
        long start = System.nanoTime();
        bSta.srtBubSta(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubStaMaMi() {
        long start = System.nanoTime();
        bSta.srtBubSta(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anBubEndGR() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubEndMiMa() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubEndMiMaRx() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anBubEndMaMi() {
        long start = System.nanoTime();
        bEnd.srtBubEnd(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anQuickGR() {
        long start = System.nanoTime();
        quSrt.srtQuick(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anQuickMiMa() {
        long start = System.nanoTime();
        quSrt.srtQuick(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anQuickMiMaRx() {
        long start = System.nanoTime();
        quSrt.srtQuick(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anQuickMaMi() {
        long start = System.nanoTime();
        quSrt.srtQuick(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerArrSrtGR() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerArrSrtMiMa() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerArrSrtMiMaRx() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerArrSrtMaMi() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerBubStaGR() {
        long start = System.nanoTime();
        meSrt.meBubSta(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubStaMiMa() {
        long start = System.nanoTime();
        meSrt.meBubSta(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubStaMiMaRx() {
        long start = System.nanoTime();
        meSrt.meBubSta(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubStaMaMi() {
        long start = System.nanoTime();
        meSrt.meBubSta(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerBubEndGR() {
        long start = System.nanoTime();
        meSrt.meArrSrt(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubEndMiMa() {
        long start = System.nanoTime();
        meSrt.meBubEnd(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubEndMiMaRx() {
        long start = System.nanoTime();
        meSrt.meBubEnd(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerBubEndMaMi() {
        long start = System.nanoTime();
        meSrt.meBubEnd(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }


    public void anMerQuickGR() {
        long start = System.nanoTime();
        meSrt.meQuick(arrGenR());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerQuickMiMa() {
        long start = System.nanoTime();
        meSrt.meQuick(arrMiMa());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerQuickMiMaRx() {
        long start = System.nanoTime();
        meSrt.meQuick(arrMiMaRX());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public void anMerQuickMaMi() {
        long start = System.nanoTime();
        meSrt.meQuick(arrMaMi());
        long end = System.nanoTime();

        System.out.println(end - start);
    }

}
