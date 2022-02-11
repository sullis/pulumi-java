// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.awsnative.evidently.outputs.ProjectDataDeliveryObject;
import io.pulumi.awsnative.evidently.outputs.ProjectTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProjectResult {
    private final @Nullable String arn;
    private final @Nullable ProjectDataDeliveryObject dataDelivery;
    private final @Nullable String description;
    private final @Nullable List<ProjectTag> tags;

    @OutputCustomType.Constructor({"arn","dataDelivery","description","tags"})
    private GetProjectResult(
        @Nullable String arn,
        @Nullable ProjectDataDeliveryObject dataDelivery,
        @Nullable String description,
        @Nullable List<ProjectTag> tags) {
        this.arn = arn;
        this.dataDelivery = dataDelivery;
        this.description = description;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<ProjectDataDeliveryObject> getDataDelivery() {
        return Optional.ofNullable(this.dataDelivery);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<ProjectTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable ProjectDataDeliveryObject dataDelivery;
        private @Nullable String description;
        private @Nullable List<ProjectTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataDelivery = defaults.dataDelivery;
    	      this.description = defaults.description;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDataDelivery(@Nullable ProjectDataDeliveryObject dataDelivery) {
            this.dataDelivery = dataDelivery;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setTags(@Nullable List<ProjectTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetProjectResult build() {
            return new GetProjectResult(arn, dataDelivery, description, tags);
        }
    }
}
