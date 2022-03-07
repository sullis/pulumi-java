// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConnectionMonitorWorkspaceSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a connection monitor output destination.
 * 
 */
public final class ConnectionMonitorOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorOutputResponse Empty = new ConnectionMonitorOutputResponse();

    /**
     * Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Describes the settings for producing output into a log analytics workspace.
     * 
     */
    @InputImport(name="workspaceSettings")
      private final @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings;

    public Optional<ConnectionMonitorWorkspaceSettingsResponse> getWorkspaceSettings() {
        return this.workspaceSettings == null ? Optional.empty() : Optional.ofNullable(this.workspaceSettings);
    }

    public ConnectionMonitorOutputResponse(
        @Nullable String type,
        @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings) {
        this.type = type;
        this.workspaceSettings = workspaceSettings;
    }

    private ConnectionMonitorOutputResponse() {
        this.type = null;
        this.workspaceSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.workspaceSettings = defaults.workspaceSettings;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setWorkspaceSettings(@Nullable ConnectionMonitorWorkspaceSettingsResponse workspaceSettings) {
            this.workspaceSettings = workspaceSettings;
            return this;
        }
        public ConnectionMonitorOutputResponse build() {
            return new ConnectionMonitorOutputResponse(type, workspaceSettings);
        }
    }
}