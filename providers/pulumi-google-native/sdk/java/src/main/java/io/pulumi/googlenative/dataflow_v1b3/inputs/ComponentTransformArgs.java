// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a transform executed as part of an execution stage.
 * 
 */
public final class ComponentTransformArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentTransformArgs Empty = new ComponentTransformArgs();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * User name for the original user transform with which this transform is most closely associated.
     * 
     */
    @InputImport(name="originalTransform")
      private final @Nullable Input<String> originalTransform;

    public Input<String> getOriginalTransform() {
        return this.originalTransform == null ? Input.empty() : this.originalTransform;
    }

    /**
     * Human-readable name for this transform; may be user or system generated.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public ComponentTransformArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> originalTransform,
        @Nullable Input<String> userName) {
        this.name = name;
        this.originalTransform = originalTransform;
        this.userName = userName;
    }

    private ComponentTransformArgs() {
        this.name = Input.empty();
        this.originalTransform = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> originalTransform;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentTransformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransform = defaults.originalTransform;
    	      this.userName = defaults.userName;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOriginalTransform(@Nullable Input<String> originalTransform) {
            this.originalTransform = originalTransform;
            return this;
        }

        public Builder setOriginalTransform(@Nullable String originalTransform) {
            this.originalTransform = Input.ofNullable(originalTransform);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public ComponentTransformArgs build() {
            return new ComponentTransformArgs(name, originalTransform, userName);
        }
    }
}