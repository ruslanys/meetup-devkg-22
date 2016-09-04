package commands

import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

/**
 * Date: 07.05.15
 * Time: 15:51
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */
class hello {

    @Command
    @Usage("Say Hello")
    static def main(InvocationContext context) {
        return "Hello World!"
    }

}