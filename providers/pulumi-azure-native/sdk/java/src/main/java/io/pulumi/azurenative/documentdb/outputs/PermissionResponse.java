// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PermissionResponse {
    /**
     * An array of data actions that are allowed.
     * 
     */
    private final @Nullable List<String> dataActions;
    /**
     * An array of data actions that are denied.
     * 
     */
    private final @Nullable List<String> notDataActions;

    @OutputCustomType.Constructor({"dataActions","notDataActions"})
    private PermissionResponse(
        @Nullable List<String> dataActions,
        @Nullable List<String> notDataActions) {
        this.dataActions = dataActions;
        this.notDataActions = notDataActions;
    }

    /**
     * An array of data actions that are allowed.
     * 
     */
    public List<String> getDataActions() {
        return this.dataActions == null ? List.of() : this.dataActions;
    }
    /**
     * An array of data actions that are denied.
     * 
     */
    public List<String> getNotDataActions() {
        return this.notDataActions == null ? List.of() : this.notDataActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dataActions;
        private @Nullable List<String> notDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataActions = defaults.dataActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        public Builder setDataActions(@Nullable List<String> dataActions) {
            this.dataActions = dataActions;
            return this;
        }

        public Builder setNotDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }

        public PermissionResponse build() {
            return new PermissionResponse(dataActions, notDataActions);
        }
    }
}
