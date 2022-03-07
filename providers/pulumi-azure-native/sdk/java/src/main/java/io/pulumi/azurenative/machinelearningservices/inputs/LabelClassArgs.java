// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a label or a category of labels in a labeling job.
 * 
 */
public final class LabelClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelClassArgs Empty = new LabelClassArgs();

    /**
     * Display name of the label class.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Dictionary of subclasses of the label class.
     * 
     */
    @InputImport(name="subclasses")
      private final @Nullable Input<Map<String,LabelClassArgs>> subclasses;

    public Input<Map<String,LabelClassArgs>> getSubclasses() {
        return this.subclasses == null ? Input.empty() : this.subclasses;
    }

    public LabelClassArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,LabelClassArgs>> subclasses) {
        this.displayName = displayName;
        this.subclasses = subclasses;
    }

    private LabelClassArgs() {
        this.displayName = Input.empty();
        this.subclasses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,LabelClassArgs>> subclasses;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.subclasses = defaults.subclasses;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setSubclasses(@Nullable Input<Map<String,LabelClassArgs>> subclasses) {
            this.subclasses = subclasses;
            return this;
        }

        public Builder setSubclasses(@Nullable Map<String,LabelClassArgs> subclasses) {
            this.subclasses = Input.ofNullable(subclasses);
            return this;
        }
        public LabelClassArgs build() {
            return new LabelClassArgs(displayName, subclasses);
        }
    }
}