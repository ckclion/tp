package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PARENTS;
import static seedu.address.model.Model.PREDICATE_SHOW_UNARCHIVED_PERSONS;

import seedu.address.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListParentsCommand extends Command {

    public static final String COMMAND_WORD = "listparents";

    public static final String MESSAGE_SUCCESS = "Listed all parents";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(
                PREDICATE_SHOW_ALL_PARENTS.and(PREDICATE_SHOW_UNARCHIVED_PERSONS));
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
