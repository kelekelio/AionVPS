package pl.aionpb.aion.items.object;


/**
 * @author Grzegorz Nowakowski
 */
public class ItemIdRangeObj {

    private int min;
    private int max;

    public ItemIdRangeObj() {
    }

    public ItemIdRangeObj(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


    public void setIdRangeBasedOnType (String type) {

        switch (type) {
            case "1h_sword":
                this.min = 100000001;
                this.max = 100100000;
                break;
            case "1h_dagger":
                this.min = 100200001;
                this.max = 100299999;
                break;
            case "1h_mace":
                this.min = 100100001;
                this.max = 100199999;
                break;
            case "2h_orb":
                this.min = 100500001;
                this.max = 100599999;
                break;
            case "2h_book":
                this.min = 100600001;
                this.max = 100699999;
                break;
            case "2h_sword":
                this.min = 100900001;
                this.max = 100999999;
                break;
            case "2h_polearm":
                this.min = 101300001;
                this.max = 101399999;
                break;
            case "2h_staff":
                this.min = 101500001;
                this.max = 101599999;
                break;
            case "bow":
                this.min = 101700001;
                this.max = 101799999;
                break;
            case "1h_gun":
                this.min = 101800000;
                this.max = 101899999;
                break;
            case "2h_cannon":
                this.min = 101900000;
                this.max = 101999999;
                break;
            case "2h_harp":
                this.min = 102000000;
                this.max = 102099999;
                break;
            case "2h_keyblade":
                this.min = 102100000;
                this.max = 102199999;
                break;
            case "2h_spray":
                this.min = 102200006;
                this.max = 102299999;
                break;
            case "supply_scroll":
                this.min = 164000001;
                this.max = 164039999;
                break;
            default:
                this.min = 1;
                this.max = 2;
        }

    }
}
