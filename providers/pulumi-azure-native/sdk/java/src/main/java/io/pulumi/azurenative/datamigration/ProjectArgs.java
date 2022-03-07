// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.datamigration.enums.ProjectSourcePlatform;
import io.pulumi.azurenative.datamigration.enums.ProjectTargetPlatform;
import io.pulumi.azurenative.datamigration.inputs.DatabaseInfoArgs;
import io.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoArgs;
import io.pulumi.azurenative.datamigration.inputs.MySqlConnectionInfoArgs;
import io.pulumi.azurenative.datamigration.inputs.PostgreSqlConnectionInfoArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * List of DatabaseInfo
     * 
     */
    @InputImport(name="databasesInfo")
      private final @Nullable Input<List<DatabaseInfoArgs>> databasesInfo;

    public Input<List<DatabaseInfoArgs>> getDatabasesInfo() {
        return this.databasesInfo == null ? Input.empty() : this.databasesInfo;
    }

    /**
     * Name of the resource group
     * 
     */
    @InputImport(name="groupName", required=true)
      private final Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the project
     * 
     */
    @InputImport(name="projectName")
      private final @Nullable Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName == null ? Input.empty() : this.projectName;
    }

    /**
     * Name of the service
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Information for connecting to source
     * 
     */
    @InputImport(name="sourceConnectionInfo")
      private final @Nullable Input<Object> sourceConnectionInfo;

    public Input<Object> getSourceConnectionInfo() {
        return this.sourceConnectionInfo == null ? Input.empty() : this.sourceConnectionInfo;
    }

    /**
     * Source platform for the project
     * 
     */
    @InputImport(name="sourcePlatform", required=true)
      private final Input<Either<String,ProjectSourcePlatform>> sourcePlatform;

    public Input<Either<String,ProjectSourcePlatform>> getSourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Information for connecting to target
     * 
     */
    @InputImport(name="targetConnectionInfo")
      private final @Nullable Input<Object> targetConnectionInfo;

    public Input<Object> getTargetConnectionInfo() {
        return this.targetConnectionInfo == null ? Input.empty() : this.targetConnectionInfo;
    }

    /**
     * Target platform for the project
     * 
     */
    @InputImport(name="targetPlatform", required=true)
      private final Input<Either<String,ProjectTargetPlatform>> targetPlatform;

    public Input<Either<String,ProjectTargetPlatform>> getTargetPlatform() {
        return this.targetPlatform;
    }

    public ProjectArgs(
        @Nullable Input<List<DatabaseInfoArgs>> databasesInfo,
        Input<String> groupName,
        @Nullable Input<String> location,
        @Nullable Input<String> projectName,
        Input<String> serviceName,
        @Nullable Input<Object> sourceConnectionInfo,
        Input<Either<String,ProjectSourcePlatform>> sourcePlatform,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Object> targetConnectionInfo,
        Input<Either<String,ProjectTargetPlatform>> targetPlatform) {
        this.databasesInfo = databasesInfo;
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.location = location;
        this.projectName = projectName;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.sourcePlatform = Objects.requireNonNull(sourcePlatform, "expected parameter 'sourcePlatform' to be non-null");
        this.tags = tags;
        this.targetConnectionInfo = targetConnectionInfo;
        this.targetPlatform = Objects.requireNonNull(targetPlatform, "expected parameter 'targetPlatform' to be non-null");
    }

    private ProjectArgs() {
        this.databasesInfo = Input.empty();
        this.groupName = Input.empty();
        this.location = Input.empty();
        this.projectName = Input.empty();
        this.serviceName = Input.empty();
        this.sourceConnectionInfo = Input.empty();
        this.sourcePlatform = Input.empty();
        this.tags = Input.empty();
        this.targetConnectionInfo = Input.empty();
        this.targetPlatform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DatabaseInfoArgs>> databasesInfo;
        private Input<String> groupName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> projectName;
        private Input<String> serviceName;
        private @Nullable Input<Object> sourceConnectionInfo;
        private Input<Either<String,ProjectSourcePlatform>> sourcePlatform;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Object> targetConnectionInfo;
        private Input<Either<String,ProjectTargetPlatform>> targetPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databasesInfo = defaults.databasesInfo;
    	      this.groupName = defaults.groupName;
    	      this.location = defaults.location;
    	      this.projectName = defaults.projectName;
    	      this.serviceName = defaults.serviceName;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.sourcePlatform = defaults.sourcePlatform;
    	      this.tags = defaults.tags;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
    	      this.targetPlatform = defaults.targetPlatform;
        }

        public Builder setDatabasesInfo(@Nullable Input<List<DatabaseInfoArgs>> databasesInfo) {
            this.databasesInfo = databasesInfo;
            return this;
        }

        public Builder setDatabasesInfo(@Nullable List<DatabaseInfoArgs> databasesInfo) {
            this.databasesInfo = Input.ofNullable(databasesInfo);
            return this;
        }

        public Builder setGroupName(Input<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Input.of(Objects.requireNonNull(groupName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProjectName(@Nullable Input<String> projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder setProjectName(@Nullable String projectName) {
            this.projectName = Input.ofNullable(projectName);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setSourceConnectionInfo(@Nullable Input<Object> sourceConnectionInfo) {
            this.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder setSourceConnectionInfo(@Nullable Object sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.ofNullable(sourceConnectionInfo);
            return this;
        }

        public Builder setSourcePlatform(Input<Either<String,ProjectSourcePlatform>> sourcePlatform) {
            this.sourcePlatform = Objects.requireNonNull(sourcePlatform);
            return this;
        }

        public Builder setSourcePlatform(Either<String,ProjectSourcePlatform> sourcePlatform) {
            this.sourcePlatform = Input.of(Objects.requireNonNull(sourcePlatform));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetConnectionInfo(@Nullable Input<Object> targetConnectionInfo) {
            this.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public Builder setTargetConnectionInfo(@Nullable Object targetConnectionInfo) {
            this.targetConnectionInfo = Input.ofNullable(targetConnectionInfo);
            return this;
        }

        public Builder setTargetPlatform(Input<Either<String,ProjectTargetPlatform>> targetPlatform) {
            this.targetPlatform = Objects.requireNonNull(targetPlatform);
            return this;
        }

        public Builder setTargetPlatform(Either<String,ProjectTargetPlatform> targetPlatform) {
            this.targetPlatform = Input.of(Objects.requireNonNull(targetPlatform));
            return this;
        }
        public ProjectArgs build() {
            return new ProjectArgs(databasesInfo, groupName, location, projectName, serviceName, sourceConnectionInfo, sourcePlatform, tags, targetConnectionInfo, targetPlatform);
        }
    }
}