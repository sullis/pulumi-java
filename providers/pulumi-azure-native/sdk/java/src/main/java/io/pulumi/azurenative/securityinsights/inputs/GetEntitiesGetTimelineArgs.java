// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.EntityTimelineKind;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntitiesGetTimelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntitiesGetTimelineArgs Empty = new GetEntitiesGetTimelineArgs();

    /**
     * The end timeline date, so the results returned are before this date.
     * 
     */
    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * entity ID
     * 
     */
    @InputImport(name="entityId", required=true)
    private final String entityId;

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * Array of timeline Item kinds.
     * 
     */
    @InputImport(name="kinds")
    private final @Nullable List<Either<String,EntityTimelineKind>> kinds;

    public List<Either<String,EntityTimelineKind>> getKinds() {
        return this.kinds == null ? List.of() : this.kinds;
    }

    /**
     * The number of bucket for timeline queries aggregation.
     * 
     */
    @InputImport(name="numberOfBucket")
    private final @Nullable Integer numberOfBucket;

    public Optional<Integer> getNumberOfBucket() {
        return this.numberOfBucket == null ? Optional.empty() : Optional.ofNullable(this.numberOfBucket);
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start timeline date, so the results returned are after this date.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetEntitiesGetTimelineArgs(
        String endTime,
        String entityId,
        @Nullable List<Either<String,EntityTimelineKind>> kinds,
        @Nullable Integer numberOfBucket,
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String startTime,
        String workspaceName) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.entityId = Objects.requireNonNull(entityId, "expected parameter 'entityId' to be non-null");
        this.kinds = kinds;
        this.numberOfBucket = numberOfBucket;
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetEntitiesGetTimelineArgs() {
        this.endTime = null;
        this.entityId = null;
        this.kinds = List.of();
        this.numberOfBucket = null;
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.startTime = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntitiesGetTimelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String entityId;
        private @Nullable List<Either<String,EntityTimelineKind>> kinds;
        private @Nullable Integer numberOfBucket;
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String startTime;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntitiesGetTimelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.entityId = defaults.entityId;
    	      this.kinds = defaults.kinds;
    	      this.numberOfBucket = defaults.numberOfBucket;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.startTime = defaults.startTime;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setEntityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }

        public Builder setKinds(@Nullable List<Either<String,EntityTimelineKind>> kinds) {
            this.kinds = kinds;
            return this;
        }

        public Builder setNumberOfBucket(@Nullable Integer numberOfBucket) {
            this.numberOfBucket = numberOfBucket;
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetEntitiesGetTimelineArgs build() {
            return new GetEntitiesGetTimelineArgs(endTime, entityId, kinds, numberOfBucket, operationalInsightsResourceProvider, resourceGroupName, startTime, workspaceName);
        }
    }
}
