// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Redirect incompatible row settings
 * 
 */
public final class RedirectIncompatibleRowSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedirectIncompatibleRowSettingsArgs Empty = new RedirectIncompatibleRowSettingsArgs();

    /**
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
    private final Input<Object> linkedServiceName;

    public Input<Object> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<Object> path;

    public Input<Object> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public RedirectIncompatibleRowSettingsArgs(
        Input<Object> linkedServiceName,
        @Nullable Input<Object> path) {
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private RedirectIncompatibleRowSettingsArgs() {
        this.linkedServiceName = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectIncompatibleRowSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> linkedServiceName;
        private @Nullable Input<Object> path;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectIncompatibleRowSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder setLinkedServiceName(Input<Object> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(Object linkedServiceName) {
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

        public RedirectIncompatibleRowSettingsArgs build() {
            return new RedirectIncompatibleRowSettingsArgs(linkedServiceName, path);
        }
    }
}
