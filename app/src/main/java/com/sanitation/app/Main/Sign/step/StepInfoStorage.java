package com.sanitation.app.Main.Sign.step;

/**
 * Created by Michael on 4/23/17.
 */

public class StepInfoStorage {
    private static StepInfoStorage mInstance;

    private StepInfoStorage() {

    }

    public static StepInfoStorage getInstance() {
        if (mInstance == null) {
            mInstance = new StepInfoStorage();
        }
        return mInstance;
    }

    public String staff_department;
    public String staff_name;
    public String staff_role;
    public String type;
    public double latitude;
    public double longitude;
}
