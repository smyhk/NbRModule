/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamtwo.r.toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.loaders.DataObject;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Debug",
        id = "org.teamtwo.r.toolbar.RExecutionAction"
)
@ActionRegistration(
        iconBase = "org/teamtwo/r/toolbar/Rlogo.png",
        displayName = "#CTL_RExecutionAction"
)
@ActionReference(path = "Loaders/text/x-r/Actions", position = -100)
@Messages("CTL_RExecutionAction=RExecution")
public final class RExecutionAction implements ActionListener
{

    private final DataObject context;

    public RExecutionAction(DataObject context)
    {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        // TODO use context
    }
}
