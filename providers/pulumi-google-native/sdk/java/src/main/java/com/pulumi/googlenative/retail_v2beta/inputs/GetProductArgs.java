// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductArgs Empty = new GetProductArgs();

    @Import(name="branchId", required=true)
    private Output<String> branchId;

    public Output<String> branchId() {
        return this.branchId;
    }

    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="productId", required=true)
    private Output<String> productId;

    public Output<String> productId() {
        return this.productId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetProductArgs() {}

    private GetProductArgs(GetProductArgs $) {
        this.branchId = $.branchId;
        this.catalogId = $.catalogId;
        this.location = $.location;
        this.productId = $.productId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductArgs $;

        public Builder() {
            $ = new GetProductArgs();
        }

        public Builder(GetProductArgs defaults) {
            $ = new GetProductArgs(Objects.requireNonNull(defaults));
        }

        public Builder branchId(Output<String> branchId) {
            $.branchId = branchId;
            return this;
        }

        public Builder branchId(String branchId) {
            return branchId(Output.of(branchId));
        }

        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetProductArgs build() {
            $.branchId = Objects.requireNonNull($.branchId, "expected parameter 'branchId' to be non-null");
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            return $;
        }
    }

}
