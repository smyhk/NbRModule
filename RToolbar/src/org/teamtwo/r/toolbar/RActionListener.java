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
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Debug",
        id = "org.teamtwo.r.toolbar.RActionListener"
)
@ActionRegistration(
        iconBase = "org/teamtwo/r/toolbar/Rlogo.png",
        displayName = "#CTL_RActionListener"
)
@ActionReferences(
{
    @ActionReference(path = "Toolbars/Debug", position = 0),
    @ActionReference(path = "Loaders/text/x-r/Actions", position = 0)
})
@Messages("CTL_RActionListener=R")
public final class RActionListener implements ActionListener
{

    private final DataObject context;

    public RActionListener(DataObject context)
    {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        // TODO use context
    }
}
