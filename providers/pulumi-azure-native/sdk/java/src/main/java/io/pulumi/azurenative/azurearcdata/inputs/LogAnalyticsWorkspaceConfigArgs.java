// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Log analytics workspace id and primary key
 * 
 */
public final class LogAnalyticsWorkspaceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsWorkspaceConfigArgs Empty = new LogAnalyticsWorkspaceConfigArgs();

    /**
     * Primary key of the workspace
     * 
     */
    @InputImport(name="primaryKey")
    private final @Nullable Input<String> primaryKey;

    public Input<String> getPrimaryKey() {
        return this.primaryKey == null ? Input.empty() : this.primaryKey;
    }

    /**
     * Azure Log Analytics workspace ID
     * 
     */
    @InputImport(name="workspaceId")
    private final @Nullable Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId == null ? Input.empty() : this.workspaceId;
    }

    public LogAnalyticsWorkspaceConfigArgs(
        @Nullable Input<String> primaryKey,
        @Nullable Input<String> workspaceId) {
        this.primaryKey = primaryKey;
        this.workspaceId = workspaceId;
    }

    private LogAnalyticsWorkspaceConfigArgs() {
        this.primaryKey = Input.empty();
        this.workspaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsWorkspaceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> primaryKey;
        private @Nullable Input<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsWorkspaceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setPrimaryKey(@Nullable Input<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = Input.ofNullable(primaryKey);
            return this;
        }

        public Builder setWorkspaceId(@Nullable Input<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder setWorkspaceId(@Nullable String workspaceId) {
            this.workspaceId = Input.ofNullable(workspaceId);
            return this;
        }

        public LogAnalyticsWorkspaceConfigArgs build() {
            return new LogAnalyticsWorkspaceConfigArgs(primaryKey, workspaceId);
        }
    }
}
