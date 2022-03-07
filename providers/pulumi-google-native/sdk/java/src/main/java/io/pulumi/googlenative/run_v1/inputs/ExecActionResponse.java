// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Not supported by Cloud Run ExecAction describes a "run in container" action.
 * 
 */
public final class ExecActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecActionResponse Empty = new ExecActionResponse();

    /**
     * (Optional) Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @InputImport(name="command", required=true)
      private final List<String> command;

    public List<String> getCommand() {
        return this.command;
    }

    public ExecActionResponse(List<String> command) {
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
    }

    private ExecActionResponse() {
        this.command = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder setCommand(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        public ExecActionResponse build() {
            return new ExecActionResponse(command);
        }
    }
}