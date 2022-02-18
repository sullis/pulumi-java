// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
 * 
 */
public final class DataFlowFolderArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataFlowFolderArgs Empty = new DataFlowFolderArgs();

    /**
     * The name of the folder that this data flow is in.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DataFlowFolderArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private DataFlowFolderArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowFolderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public DataFlowFolderArgs build() {
            return new DataFlowFolderArgs(name);
        }
    }
}
