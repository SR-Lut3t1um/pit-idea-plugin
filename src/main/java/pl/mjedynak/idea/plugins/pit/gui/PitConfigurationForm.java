package pl.mjedynak.idea.plugins.pit.gui;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.jetbrains.annotations.NotNull;
import pl.mjedynak.idea.plugins.pit.PitRunConfiguration;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Insets;

public class PitConfigurationForm extends SettingsEditor<PitRunConfiguration> {

    private JPanel panel;
    private JLabel targetClassesLabel;
    private JTextField targetClassesTextField;
    private JLabel sourceDirLabel;
    private JTextField sourceDirTextField;
    private JLabel reportDirLabel;
    private JTextField reportDirTextField;
    private JTextField otherParamsTextField;
    private JLabel otherParamsLabel;


    public String getReportDir() {
        return reportDirTextField.getText();
    }

    public String getSourceDir() {
        return sourceDirTextField.getText();
    }

    public String getTargetClasses() {
        return targetClassesTextField.getText();
    }

    public String getOtherParams() {
        return otherParamsTextField.getText();
    }

    public void setReportDir(String reportDir) {
        reportDirTextField.setText(reportDir);
    }

    public void setSourceDir(String sourceDir) {
        sourceDirTextField.setText(sourceDir);
    }

    public void setTargetClasses(String targetClasses) {
        targetClassesTextField.setText(targetClasses);
    }

    public void setOtherParams(String otherParams) {
        otherParamsTextField.setText(otherParams);
    }

    @Override
    protected void resetEditorFrom(PitRunConfiguration s) {
    }

    @Override
    protected void applyEditorTo(PitRunConfiguration s) throws ConfigurationException {
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return panel;
    }

    @Override
    protected void disposeEditor() {
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        targetClassesTextField = new JTextField();
        panel.add(targetClassesTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel.add(spacer1, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        targetClassesLabel = new JLabel();
        targetClassesLabel.setText("Target classes");
        panel.add(targetClassesLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        sourceDirTextField = new JTextField();
        panel.add(sourceDirTextField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        sourceDirLabel = new JLabel();
        sourceDirLabel.setText("Source dir");
        panel.add(sourceDirLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        reportDirTextField = new JTextField();
        panel.add(reportDirTextField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        reportDirLabel = new JLabel();
        reportDirLabel.setText("Report dir");
        panel.add(reportDirLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        otherParamsTextField = new JTextField();
        panel.add(otherParamsTextField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        otherParamsLabel = new JLabel();
        otherParamsLabel.setText("Other params");
        panel.add(otherParamsLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }
}
