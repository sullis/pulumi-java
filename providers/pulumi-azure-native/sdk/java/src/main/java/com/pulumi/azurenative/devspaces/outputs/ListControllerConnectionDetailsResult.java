// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devspaces.outputs;

import com.pulumi.azurenative.devspaces.outputs.ControllerConnectionDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListControllerConnectionDetailsResult {
    /**
     * @return List of Azure Dev Spaces Controller connection details.
     * 
     */
    private final @Nullable List<ControllerConnectionDetailsResponse> connectionDetailsList;

    @CustomType.Constructor
    private ListControllerConnectionDetailsResult(@CustomType.Parameter("connectionDetailsList") @Nullable List<ControllerConnectionDetailsResponse> connectionDetailsList) {
        this.connectionDetailsList = connectionDetailsList;
    }

    /**
     * @return List of Azure Dev Spaces Controller connection details.
     * 
     */
    public List<ControllerConnectionDetailsResponse> connectionDetailsList() {
        return this.connectionDetailsList == null ? List.of() : this.connectionDetailsList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListControllerConnectionDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ControllerConnectionDetailsResponse> connectionDetailsList;

        public Builder() {
    	      // Empty
        }

        public Builder(ListControllerConnectionDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionDetailsList = defaults.connectionDetailsList;
        }

        public Builder connectionDetailsList(@Nullable List<ControllerConnectionDetailsResponse> connectionDetailsList) {
            this.connectionDetailsList = connectionDetailsList;
            return this;
        }
        public Builder connectionDetailsList(ControllerConnectionDetailsResponse... connectionDetailsList) {
            return connectionDetailsList(List.of(connectionDetailsList));
        }        public ListControllerConnectionDetailsResult build() {
            return new ListControllerConnectionDetailsResult(connectionDetailsList);
        }
    }
}
