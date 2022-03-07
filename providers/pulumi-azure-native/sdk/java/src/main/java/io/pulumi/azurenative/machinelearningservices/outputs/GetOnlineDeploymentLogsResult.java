// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOnlineDeploymentLogsResult {
    /**
     * The retrieved online deployment logs.
     * 
     */
    private final @Nullable String content;

    @OutputCustomType.Constructor({"content"})
    private GetOnlineDeploymentLogsResult(@Nullable String content) {
        this.content = content;
    }

    /**
     * The retrieved online deployment logs.
     * 
    */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineDeploymentLogsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOnlineDeploymentLogsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }
        public GetOnlineDeploymentLogsResult build() {
            return new GetOnlineDeploymentLogsResult(content);
        }
    }
}