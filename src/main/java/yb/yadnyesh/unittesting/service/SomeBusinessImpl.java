package yb.yadnyesh.unittesting.service;

import yb.yadnyesh.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

    private SomeDataService someDataService;

    public int calculateSum(int[] data) {
        int sum =  0;
        for(int value: data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumUsingDataService() {
        int sum =  0;
        int[] data = someDataService.retreiveAllData();
        for(int value: data) {
            sum += value;
        }
        return sum;
    }

    public SomeDataService getSomeDataService() {
        return someDataService;
    }

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }
}
