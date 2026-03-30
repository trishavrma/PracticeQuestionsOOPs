/*8.Define an interface named Filterable with abstract methods
like apply_filter(filter_type) and reset_filter().
Create two classes, ImageProcessor and DataAnalyzer, that
both implement the Filterable interface.
Implement the methods in each class to perform distinct actions relevant to image
and data processing respectively, showcasing a shared contract with different
implementations.*/

interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}

class ImageProcessor implements Filterable {
    
    public void applyFilter(String filterType) {
        System.out.println("Applying image filter: " + filterType + " (e.g., Gaussian Blur, Sepia)");
    }

    public void resetFilter() {
        System.out.println("Resetting image to original state.");
    }
}

class DataAnalyzer implements Filterable {
    public void applyFilter(String filterType) {
        System.out.println("Applying data filter: " + filterType + " (e.g., SQL WHERE clause, Date Range)");
    }

    public void resetFilter() {
        System.out.println("Clearing all data filters.");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Filterable image = new ImageProcessor();
        Filterable data = new DataAnalyzer();

        image.applyFilter("Sepia");
        image.resetFilter();

        data.applyFilter("DateRange > 2023");
        data.resetFilter();
    }
}
