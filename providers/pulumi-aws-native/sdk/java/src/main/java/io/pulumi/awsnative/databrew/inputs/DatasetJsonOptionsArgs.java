// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Json options
 * 
 */
public final class DatasetJsonOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetJsonOptionsArgs Empty = new DatasetJsonOptionsArgs();

    @Import(name="multiLine")
      private final @Nullable Output<Boolean> multiLine;

    public Output<Boolean> multiLine() {
        return this.multiLine == null ? Codegen.empty() : this.multiLine;
    }

    public DatasetJsonOptionsArgs(@Nullable Output<Boolean> multiLine) {
        this.multiLine = multiLine;
    }

    private DatasetJsonOptionsArgs() {
        this.multiLine = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetJsonOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> multiLine;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetJsonOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiLine = defaults.multiLine;
        }

        public Builder multiLine(@Nullable Output<Boolean> multiLine) {
            this.multiLine = multiLine;
            return this;
        }
        public Builder multiLine(@Nullable Boolean multiLine) {
            this.multiLine = Codegen.ofNullable(multiLine);
            return this;
        }        public DatasetJsonOptionsArgs build() {
            return new DatasetJsonOptionsArgs(multiLine);
        }
    }
}
