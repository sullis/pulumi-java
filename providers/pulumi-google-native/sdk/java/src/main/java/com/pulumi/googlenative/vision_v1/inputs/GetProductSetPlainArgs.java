// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductSetPlainArgs Empty = new GetProductSetPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="productSetId", required=true)
    private String productSetId;

    public String productSetId() {
        return this.productSetId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetProductSetPlainArgs() {}

    private GetProductSetPlainArgs(GetProductSetPlainArgs $) {
        this.location = $.location;
        this.productSetId = $.productSetId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductSetPlainArgs $;

        public Builder() {
            $ = new GetProductSetPlainArgs();
        }

        public Builder(GetProductSetPlainArgs defaults) {
            $ = new GetProductSetPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder productSetId(String productSetId) {
            $.productSetId = productSetId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetProductSetPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.productSetId = Objects.requireNonNull($.productSetId, "expected parameter 'productSetId' to be non-null");
            return $;
        }
    }

}
