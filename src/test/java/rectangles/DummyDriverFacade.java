package rectangles;

import net.itarray.automotion.internal.DriverFacade;
import org.openqa.selenium.Dimension;

import java.io.File;

public class DummyDriverFacade extends DriverFacade {

    private Dimension pageSize;
    private Dimension resolution;

    public DummyDriverFacade() {
        super(null);
        resolution = new Dimension(1280, 1080);
        pageSize = new Dimension(RectangleFixture.pageWidth, RectangleFixture.pageHeight);
    }

    public void setPageSize(Dimension pageSize) {
        this.pageSize = pageSize;
    }

    public static DriverFacade createWebDriver() {
        return new DummyDriverFacade();
    }

    @Override
    public File takeScreenshot() {
        throw new RuntimeException("should not happen");
    }

    @Override
    public boolean isAppiumWebContext() {
        throw new RuntimeException("should not happen");
    }

    @Override
    public boolean isAppiumNativeMobileContext() {
        throw new RuntimeException("should not happen");
    }

    @Override
    public Object executeScript(String script) {
        throw new RuntimeException("should not happen");
    }

    @Override
    public String getZoom() {
        return "100%";
    }

    @Override
    public Dimension retrievePageSize() {
        return pageSize;
    }

    @Override
    public void setResolution(Dimension resolution) {
        this.resolution = new Dimension(resolution.getWidth(), resolution.getHeight());
    }

    @Override
    public Dimension getResolution() {
        return resolution;
    }

    @Override
    public void setZoom(int percentage) {
        throw new RuntimeException("should not happen");
    }
}