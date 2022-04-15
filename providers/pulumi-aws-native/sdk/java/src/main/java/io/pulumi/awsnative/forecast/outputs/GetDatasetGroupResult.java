// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast.outputs;

import io.pulumi.awsnative.forecast.enums.DatasetGroupDomain;
import io.pulumi.awsnative.forecast.outputs.DatasetGroupTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatasetGroupResult {
    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * 
     */
    private final @Nullable List<String> datasetArns;
    /**
     * The Amazon Resource Name (ARN) of the dataset group to delete.
     * 
     */
    private final @Nullable String datasetGroupArn;
    /**
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match.
     * 
     */
    private final @Nullable DatasetGroupDomain domain;
    /**
     * The tags of Application Insights application.
     * 
     */
    private final @Nullable List<DatasetGroupTag> tags;

    @CustomType.Constructor
    private GetDatasetGroupResult(
        @CustomType.Parameter("datasetArns") @Nullable List<String> datasetArns,
        @CustomType.Parameter("datasetGroupArn") @Nullable String datasetGroupArn,
        @CustomType.Parameter("domain") @Nullable DatasetGroupDomain domain,
        @CustomType.Parameter("tags") @Nullable List<DatasetGroupTag> tags) {
        this.datasetArns = datasetArns;
        this.datasetGroupArn = datasetGroupArn;
        this.domain = domain;
        this.tags = tags;
    }

    /**
     * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
     * 
    */
    public List<String> datasetArns() {
        return this.datasetArns == null ? List.of() : this.datasetArns;
    }
    /**
     * The Amazon Resource Name (ARN) of the dataset group to delete.
     * 
    */
    public Optional<String> datasetGroupArn() {
        return Optional.ofNullable(this.datasetGroupArn);
    }
    /**
     * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match.
     * 
    */
    public Optional<DatasetGroupDomain> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * The tags of Application Insights application.
     * 
    */
    public List<DatasetGroupTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> datasetArns;
        private @Nullable String datasetGroupArn;
        private @Nullable DatasetGroupDomain domain;
        private @Nullable List<DatasetGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetArns = defaults.datasetArns;
    	      this.datasetGroupArn = defaults.datasetGroupArn;
    	      this.domain = defaults.domain;
    	      this.tags = defaults.tags;
        }

        public Builder datasetArns(@Nullable List<String> datasetArns) {
            this.datasetArns = datasetArns;
            return this;
        }
        public Builder datasetArns(String... datasetArns) {
            return datasetArns(List.of(datasetArns));
        }
        public Builder datasetGroupArn(@Nullable String datasetGroupArn) {
            this.datasetGroupArn = datasetGroupArn;
            return this;
        }
        public Builder domain(@Nullable DatasetGroupDomain domain) {
            this.domain = domain;
            return this;
        }
        public Builder tags(@Nullable List<DatasetGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DatasetGroupTag... tags) {
            return tags(List.of(tags));
        }        public GetDatasetGroupResult build() {
            return new GetDatasetGroupResult(datasetArns, datasetGroupArn, domain, tags);
        }
    }
}
