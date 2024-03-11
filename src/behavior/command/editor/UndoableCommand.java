package behavior.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
