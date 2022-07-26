package com.wzz.command.my;

/**
 * 开电视命令
 */
class TVOffCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        super();
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}

/**
 * 关电视命令
 */
class TVOnCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
