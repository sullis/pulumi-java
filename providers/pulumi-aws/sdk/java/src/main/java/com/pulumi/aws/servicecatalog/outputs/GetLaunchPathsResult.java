// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.aws.servicecatalog.outputs.GetLaunchPathsSummary;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLaunchPathsResult {
    private final @Nullable String acceptLanguage;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String productId;
    /**
     * @return Block with information about the launch path. See details below.
     * 
     */
    private final List<GetLaunchPathsSummary> summaries;

    @CustomType.Constructor
    private GetLaunchPathsResult(
        @CustomType.Parameter("acceptLanguage") @Nullable String acceptLanguage,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("productId") String productId,
        @CustomType.Parameter("summaries") List<GetLaunchPathsSummary> summaries) {
        this.acceptLanguage = acceptLanguage;
        this.id = id;
        this.productId = productId;
        this.summaries = summaries;
    }

    public Optional<String> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String productId() {
        return this.productId;
    }
    /**
     * @return Block with information about the launch path. See details below.
     * 
     */
    public List<GetLaunchPathsSummary> summaries() {
        return this.summaries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchPathsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String id;
        private String productId;
        private List<GetLaunchPathsSummary> summaries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchPathsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.id = defaults.id;
    	      this.productId = defaults.productId;
    	      this.summaries = defaults.summaries;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        public Builder summaries(List<GetLaunchPathsSummary> summaries) {
            this.summaries = Objects.requireNonNull(summaries);
            return this;
        }
        public Builder summaries(GetLaunchPathsSummary... summaries) {
            return summaries(List.of(summaries));
        }        public GetLaunchPathsResult build() {
            return new GetLaunchPathsResult(acceptLanguage, id, productId, summaries);
        }
    }
}
