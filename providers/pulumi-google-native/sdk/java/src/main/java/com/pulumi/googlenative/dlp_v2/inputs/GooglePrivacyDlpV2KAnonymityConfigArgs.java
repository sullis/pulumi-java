// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2EntityIdArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * k-anonymity metric, used for analysis of reidentification risk.
 * 
 */
public final class GooglePrivacyDlpV2KAnonymityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2KAnonymityConfigArgs Empty = new GooglePrivacyDlpV2KAnonymityConfigArgs();

    /**
     * Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
     * 
     */
    @Import(name="entityId")
    private @Nullable Output<GooglePrivacyDlpV2EntityIdArgs> entityId;

    /**
     * @return Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2EntityIdArgs>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    /**
     * Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
     * 
     */
    @Import(name="quasiIds")
    private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds;

    /**
     * @return Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2FieldIdArgs>>> quasiIds() {
        return Optional.ofNullable(this.quasiIds);
    }

    private GooglePrivacyDlpV2KAnonymityConfigArgs() {}

    private GooglePrivacyDlpV2KAnonymityConfigArgs(GooglePrivacyDlpV2KAnonymityConfigArgs $) {
        this.entityId = $.entityId;
        this.quasiIds = $.quasiIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2KAnonymityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2KAnonymityConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2KAnonymityConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2KAnonymityConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2KAnonymityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityId Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
         * 
         * @return builder
         * 
         */
        public Builder entityId(@Nullable Output<GooglePrivacyDlpV2EntityIdArgs> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
         * 
         * @return builder
         * 
         */
        public Builder entityId(GooglePrivacyDlpV2EntityIdArgs entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param quasiIds Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
         * 
         * @return builder
         * 
         */
        public Builder quasiIds(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds) {
            $.quasiIds = quasiIds;
            return this;
        }

        /**
         * @param quasiIds Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
         * 
         * @return builder
         * 
         */
        public Builder quasiIds(List<GooglePrivacyDlpV2FieldIdArgs> quasiIds) {
            return quasiIds(Output.of(quasiIds));
        }

        /**
         * @param quasiIds Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
         * 
         * @return builder
         * 
         */
        public Builder quasiIds(GooglePrivacyDlpV2FieldIdArgs... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }

        public GooglePrivacyDlpV2KAnonymityConfigArgs build() {
            return $;
        }
    }

}
