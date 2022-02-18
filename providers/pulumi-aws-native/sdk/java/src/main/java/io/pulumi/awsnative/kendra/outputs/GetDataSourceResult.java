// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataSourceResult {
    private final @Nullable String arn;
    private final @Nullable DataSourceConfiguration dataSourceConfiguration;
    private final @Nullable String description;
    private final @Nullable String id;
    private final @Nullable String indexId;
    private final @Nullable String name;
    private final @Nullable String roleArn;
    private final @Nullable String schedule;
    /**
     * Tags for labeling the data source
     * 
     */
    private final @Nullable List<DataSourceTag> tags;

    @OutputCustomType.Constructor({"arn","dataSourceConfiguration","description","id","indexId","name","roleArn","schedule","tags"})
    private GetDataSourceResult(
        @Nullable String arn,
        @Nullable DataSourceConfiguration dataSourceConfiguration,
        @Nullable String description,
        @Nullable String id,
        @Nullable String indexId,
        @Nullable String name,
        @Nullable String roleArn,
        @Nullable String schedule,
        @Nullable List<DataSourceTag> tags) {
        this.arn = arn;
        this.dataSourceConfiguration = dataSourceConfiguration;
        this.description = description;
        this.id = id;
        this.indexId = indexId;
        this.name = name;
        this.roleArn = roleArn;
        this.schedule = schedule;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<DataSourceConfiguration> getDataSourceConfiguration() {
        return Optional.ofNullable(this.dataSourceConfiguration);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getIndexId() {
        return Optional.ofNullable(this.indexId);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<String> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * Tags for labeling the data source
     * 
     */
    public List<DataSourceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable DataSourceConfiguration dataSourceConfiguration;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String indexId;
        private @Nullable String name;
        private @Nullable String roleArn;
        private @Nullable String schedule;
        private @Nullable List<DataSourceTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSourceConfiguration = defaults.dataSourceConfiguration;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.schedule = defaults.schedule;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDataSourceConfiguration(@Nullable DataSourceConfiguration dataSourceConfiguration) {
            this.dataSourceConfiguration = dataSourceConfiguration;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIndexId(@Nullable String indexId) {
            this.indexId = indexId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setTags(@Nullable List<DataSourceTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDataSourceResult build() {
            return new GetDataSourceResult(arn, dataSourceConfiguration, description, id, indexId, name, roleArn, schedule, tags);
        }
    }
}
