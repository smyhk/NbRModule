/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamtwo.r.execution;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
//import org.netbeans.r.execution.ReditorRunnable;
import org.teamtwo.r.options.RPanel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.loaders.DataObject;
import org.openide.util.NbBundle.Messages;
import org.openide.util.NbPreferences;
import org.openide.util.RequestProcessor;

@ActionID(
        category = "Debug",
        id = "org.teamtwo.r.execution.RunFileAction"
)
@ActionRegistration(
        //iconBase = "org/netbeans/r/language/Execute.jpg",
        displayName = "#CTL_RunFileAction"
)
@Messages("CTL_RunFileAction=Execute")

@ActionReference(path = "RFileExecution")
public final class RunFileAction implements ActionListener {

    private final List<DataObject> context;
    private RequestProcessor processor = null;

    public RunFileAction(List<DataObject> context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        String executableFilePath = NbPreferences.forModule(RPanel.class).get("RConfiguration.path", "");
        File file = new File(executableFilePath);

        for (DataObject dataObject : context) {
            processor = new RequestProcessor("Exec", 1, true);
            if ("Rscript".equals(file.getName())) {
                processor.execute(new REditorRunnable(dataObject, ""));
            } else {
                processor.execute(new REditorRunnable(dataObject, " -q -f "));
            }
        }
    }
}