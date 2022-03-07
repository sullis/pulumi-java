// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Log location settings.
 * 
 */
public final class LogLocationSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogLocationSettingsArgs Empty = new LogLocationSettingsArgs();

    /**
     * Log storage linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
      private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<Object> path;

    public Input<Object> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public LogLocationSettingsArgs(
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Object> path) {
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private LogLocationSettingsArgs() {
        this.linkedServiceName = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogLocationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Object> path;

        public Builder() {
    	      // Empty
        }

        public Builder(LogLocationSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder setLinkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder setPath(@Nullable Input<Object> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = Input.ofNullable(path);
            return this;
        }
        public LogLocationSettingsArgs build() {
            return new LogLocationSettingsArgs(linkedServiceName, path);
        }
    }
}