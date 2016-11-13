/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamtwo.r.toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.teamtwo.r.toolbar.RActionListener"
)
@ActionRegistration(
        iconBase = "org/teamtwo/r/toolbar/Rlogo.png",
        displayName = "#CTL_RActionListener"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_RActionListener=RAction")
public final class RActionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO implement action body
    }
}
