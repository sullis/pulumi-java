// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.HoursOfOperationConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HoursOfOperationState extends io.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationState Empty = new HoursOfOperationState();

    /**
     * One or more config blocks which define the configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below.
     * 
     */
    @Import(name="configs")
      private final @Nullable Output<List<HoursOfOperationConfigGetArgs>> configs;

    public Output<List<HoursOfOperationConfigGetArgs>> getConfigs() {
        return this.configs == null ? Output.empty() : this.configs;
    }

    /**
     * Specifies the description of the Hours of Operation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     */
    @Import(name="hoursOfOperationArn")
      private final @Nullable Output<String> hoursOfOperationArn;

    public Output<String> getHoursOfOperationArn() {
        return this.hoursOfOperationArn == null ? Output.empty() : this.hoursOfOperationArn;
    }

    /**
     * The identifier for the hours of operation.
     * 
     */
    @Import(name="hoursOfOperationId")
      private final @Nullable Output<String> hoursOfOperationId;

    public Output<String> getHoursOfOperationId() {
        return this.hoursOfOperationId == null ? Output.empty() : this.hoursOfOperationId;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Output.empty() : this.instanceId;
    }

    /**
     * Specifies the name of the Hours of Operation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Tags to apply to the Hours of Operation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Specifies the time zone of the Hours of Operation.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public HoursOfOperationState(
        @Nullable Output<List<HoursOfOperationConfigGetArgs>> configs,
        @Nullable Output<String> description,
        @Nullable Output<String> hoursOfOperationArn,
        @Nullable Output<String> hoursOfOperationId,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> timeZone) {
        this.configs = configs;
        this.description = description;
        this.hoursOfOperationArn = hoursOfOperationArn;
        this.hoursOfOperationId = hoursOfOperationId;
        this.instanceId = instanceId;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.timeZone = timeZone;
    }

    private HoursOfOperationState() {
        this.configs = Output.empty();
        this.description = Output.empty();
        this.hoursOfOperationArn = Output.empty();
        this.hoursOfOperationId = Output.empty();
        this.instanceId = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HoursOfOperationConfigGetArgs>> configs;
        private @Nullable Output<String> description;
        private @Nullable Output<String> hoursOfOperationArn;
        private @Nullable Output<String> hoursOfOperationId;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.description = defaults.description;
    	      this.hoursOfOperationArn = defaults.hoursOfOperationArn;
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder configs(@Nullable Output<List<HoursOfOperationConfigGetArgs>> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(@Nullable List<HoursOfOperationConfigGetArgs> configs) {
            this.configs = Output.ofNullable(configs);
            return this;
        }
        public Builder configs(HoursOfOperationConfigGetArgs... configs) {
            return configs(List.of(configs));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder hoursOfOperationArn(@Nullable Output<String> hoursOfOperationArn) {
            this.hoursOfOperationArn = hoursOfOperationArn;
            return this;
        }
        public Builder hoursOfOperationArn(@Nullable String hoursOfOperationArn) {
            this.hoursOfOperationArn = Output.ofNullable(hoursOfOperationArn);
            return this;
        }
        public Builder hoursOfOperationId(@Nullable Output<String> hoursOfOperationId) {
            this.hoursOfOperationId = hoursOfOperationId;
            return this;
        }
        public Builder hoursOfOperationId(@Nullable String hoursOfOperationId) {
            this.hoursOfOperationId = Output.ofNullable(hoursOfOperationId);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Output.ofNullable(instanceId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }        public HoursOfOperationState build() {
            return new HoursOfOperationState(configs, description, hoursOfOperationArn, hoursOfOperationId, instanceId, name, tags, tagsAll, timeZone);
        }
    }
}
