// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler;

import io.pulumi.azurenative.scheduler.inputs.JobCollectionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobCollectionArgs Empty = new JobCollectionArgs();

    /**
     * The job collection name.
     * 
     */
    @InputImport(name="jobCollectionName")
    private final @Nullable Input<String> jobCollectionName;

    public Input<String> getJobCollectionName() {
        return this.jobCollectionName == null ? Input.empty() : this.jobCollectionName;
    }

    /**
     * Gets or sets the storage account location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Gets or sets the job collection resource name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Gets or sets the job collection properties.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<JobCollectionPropertiesArgs> properties;

    public Input<JobCollectionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public JobCollectionArgs(
        @Nullable Input<String> jobCollectionName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<JobCollectionPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.jobCollectionName = jobCollectionName;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private JobCollectionArgs() {
        this.jobCollectionName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> jobCollectionName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<JobCollectionPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobCollectionName = defaults.jobCollectionName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setJobCollectionName(@Nullable Input<String> jobCollectionName) {
            this.jobCollectionName = jobCollectionName;
            return this;
        }

        public Builder setJobCollectionName(@Nullable String jobCollectionName) {
            this.jobCollectionName = Input.ofNullable(jobCollectionName);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<JobCollectionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable JobCollectionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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

        public JobCollectionArgs build() {
            return new JobCollectionArgs(jobCollectionName, location, name, properties, resourceGroupName, tags);
        }
    }
}
