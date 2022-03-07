// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionRepositoryCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionRepositoryCredentialsArgs Empty = new TaskDefinitionRepositoryCredentialsArgs();

    @InputImport(name="credentialsParameter")
      private final @Nullable Input<String> credentialsParameter;

    public Input<String> getCredentialsParameter() {
        return this.credentialsParameter == null ? Input.empty() : this.credentialsParameter;
    }

    public TaskDefinitionRepositoryCredentialsArgs(@Nullable Input<String> credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    private TaskDefinitionRepositoryCredentialsArgs() {
        this.credentialsParameter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRepositoryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> credentialsParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRepositoryCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialsParameter = defaults.credentialsParameter;
        }

        public Builder setCredentialsParameter(@Nullable Input<String> credentialsParameter) {
            this.credentialsParameter = credentialsParameter;
            return this;
        }

        public Builder setCredentialsParameter(@Nullable String credentialsParameter) {
            this.credentialsParameter = Input.ofNullable(credentialsParameter);
            return this;
        }
        public TaskDefinitionRepositoryCredentialsArgs build() {
            return new TaskDefinitionRepositoryCredentialsArgs(credentialsParameter);
        }
    }
}