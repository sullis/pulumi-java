// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.awsnative.apigateway.outputs.UsagePlanApiStage;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanQuotaSettings;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanTag;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanThrottleSettings;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUsagePlanResult {
    private final @Nullable List<UsagePlanApiStage> apiStages;
    private final @Nullable String description;
    private final @Nullable String id;
    private final @Nullable UsagePlanQuotaSettings quota;
    private final @Nullable List<UsagePlanTag> tags;
    private final @Nullable UsagePlanThrottleSettings throttle;
    private final @Nullable String usagePlanName;

    @OutputCustomType.Constructor({"apiStages","description","id","quota","tags","throttle","usagePlanName"})
    private GetUsagePlanResult(
        @Nullable List<UsagePlanApiStage> apiStages,
        @Nullable String description,
        @Nullable String id,
        @Nullable UsagePlanQuotaSettings quota,
        @Nullable List<UsagePlanTag> tags,
        @Nullable UsagePlanThrottleSettings throttle,
        @Nullable String usagePlanName) {
        this.apiStages = apiStages;
        this.description = description;
        this.id = id;
        this.quota = quota;
        this.tags = tags;
        this.throttle = throttle;
        this.usagePlanName = usagePlanName;
    }

    public List<UsagePlanApiStage> getApiStages() {
        return this.apiStages == null ? List.of() : this.apiStages;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<UsagePlanQuotaSettings> getQuota() {
        return Optional.ofNullable(this.quota);
    }
    public List<UsagePlanTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<UsagePlanThrottleSettings> getThrottle() {
        return Optional.ofNullable(this.throttle);
    }
    public Optional<String> getUsagePlanName() {
        return Optional.ofNullable(this.usagePlanName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsagePlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<UsagePlanApiStage> apiStages;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable UsagePlanQuotaSettings quota;
        private @Nullable List<UsagePlanTag> tags;
        private @Nullable UsagePlanThrottleSettings throttle;
        private @Nullable String usagePlanName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUsagePlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiStages = defaults.apiStages;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.quota = defaults.quota;
    	      this.tags = defaults.tags;
    	      this.throttle = defaults.throttle;
    	      this.usagePlanName = defaults.usagePlanName;
        }

        public Builder setApiStages(@Nullable List<UsagePlanApiStage> apiStages) {
            this.apiStages = apiStages;
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

        public Builder setQuota(@Nullable UsagePlanQuotaSettings quota) {
            this.quota = quota;
            return this;
        }

        public Builder setTags(@Nullable List<UsagePlanTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThrottle(@Nullable UsagePlanThrottleSettings throttle) {
            this.throttle = throttle;
            return this;
        }

        public Builder setUsagePlanName(@Nullable String usagePlanName) {
            this.usagePlanName = usagePlanName;
            return this;
        }

        public GetUsagePlanResult build() {
            return new GetUsagePlanResult(apiStages, description, id, quota, tags, throttle, usagePlanName);
        }
    }
}
