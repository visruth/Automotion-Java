package util.validator;

import net.itarray.automotion.validation.UIElementValidator;
import org.openqa.selenium.WebElement;
import net.itarray.automotion.validation.properties.Padding;

import java.util.List;

/**
 * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.UIElementValidator}
 */
@Deprecated
public interface Validator extends UIElementValidator {

    UIValidator changeMetricsUnitsTo(util.validator.ResponsiveUIValidator.Units units);

    UIValidator changeMetricsUnitsTo(net.itarray.automotion.validation.Units units);

    UIValidator isRightOf(WebElement element);

    UIValidator isLeftOf(WebElement element);

    UIValidator isBelow(WebElement element);

    UIValidator isAbove(WebElement element);

    UIValidator isNotOverlapping(WebElement element, String readableName);

    UIValidator isOverlapping(WebElement element, String readableName);

    UIValidator isNotOverlapping(List<WebElement> elements);

    UIValidator isLeftAlignedWith(WebElement element, String readableName);

    UIValidator isLeftAlignedWith(List<WebElement> elements);

    UIValidator isRightAlignedWith(WebElement element, String readableName);

    UIValidator isRightAlignedWith(List<WebElement> elements);

    UIValidator isTopAlignedWith(WebElement element, String readableName);

    UIValidator isTopAlignedWith(List<WebElement> elements);

    UIValidator isBottomAlignedWith(WebElement element, String readableName);

    UIValidator isBottomAlignedWith(List<WebElement> elements);

    UIValidator hasEqualWidthAs(WebElement element, String readableName);

    UIValidator hasEqualWidthAs(List<WebElement> elements);

    UIValidator hasEqualHeightAs(WebElement element, String readableName);

    UIValidator hasEqualHeightAs(List<WebElement> elements);

    UIValidator hasEqualSizeAs(WebElement element, String readableName);

    UIValidator hasEqualSizeAs(List<WebElement> elements);

    UIValidator hasDifferentSizeAs(WebElement element, String readableName);

    UIValidator hasDifferentSizeAs(List<WebElement> elements);

    UIValidator minOffset(int top, int right, int bottom, int left);

    UIValidator maxOffset(int top, int right, int bottom, int left);

    UIValidator hasCssValue(String cssProperty, String... args);

    UIValidator doesNotHaveCssValue(String cssProperty, String... args);

    UIValidator isCenteredOnPageHorizontally();

    UIValidator isCenteredOnPageVertically();

    UIValidator isInsideOf(WebElement containerElement, String readableContainerName);

    UIValidator isInsideOf(WebElement containerElement, String readableContainerName, Padding padding);

}
