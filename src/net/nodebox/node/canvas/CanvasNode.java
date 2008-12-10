package net.nodebox.node.canvas;

import net.nodebox.graphics.Canvas;
import net.nodebox.node.Node;
import net.nodebox.node.Parameter;

import java.util.Map;

public abstract class CanvasNode extends Node {

    protected Map<String, Canvas> inputValues;
    protected Canvas outputValue;

    public CanvasNode() {
        super(Parameter.Type.GROB_CANVAS);
    }

    public CanvasNode(String name) {
        super(Parameter.Type.GROB_CANVAS, name);
    }
}