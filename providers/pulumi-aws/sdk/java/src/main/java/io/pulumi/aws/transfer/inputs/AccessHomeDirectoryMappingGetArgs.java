// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AccessHomeDirectoryMappingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessHomeDirectoryMappingGetArgs Empty = new AccessHomeDirectoryMappingGetArgs();

    /**
     * Represents an entry and a target.
     * 
     */
    @Import(name="entry", required=true)
      private final Output<String> entry;

    public Output<String> getEntry() {
        return this.entry;
    }

    /**
     * Represents the map target.
     * 
     */
    @Import(name="target", required=true)
      private final Output<String> target;

    public Output<String> getTarget() {
        return this.target;
    }

    public AccessHomeDirectoryMappingGetArgs(
        Output<String> entry,
        Output<String> target) {
        this.entry = Objects.requireNonNull(entry, "expected parameter 'entry' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private AccessHomeDirectoryMappingGetArgs() {
        this.entry = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessHomeDirectoryMappingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> entry;
        private Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessHomeDirectoryMappingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.target = defaults.target;
        }

        public Builder entry(Output<String> entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }
        public Builder entry(String entry) {
            this.entry = Output.of(Objects.requireNonNull(entry));
            return this;
        }
        public Builder target(Output<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(String target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public AccessHomeDirectoryMappingGetArgs build() {
            return new AccessHomeDirectoryMappingGetArgs(entry, target);
        }
    }
}
