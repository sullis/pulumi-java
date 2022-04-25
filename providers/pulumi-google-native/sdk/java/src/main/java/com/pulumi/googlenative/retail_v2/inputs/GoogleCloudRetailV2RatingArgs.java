// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The rating of a Product.
 * 
 */
public final class GoogleCloudRetailV2RatingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2RatingArgs Empty = new GoogleCloudRetailV2RatingArgs();

    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="averageRating")
    private @Nullable Output<Double> averageRating;

    /**
     * @return The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Optional<Output<Double>> averageRating() {
        return Optional.ofNullable(this.averageRating);
    }

    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="ratingCount")
    private @Nullable Output<Integer> ratingCount;

    /**
     * @return The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Optional<Output<Integer>> ratingCount() {
        return Optional.ofNullable(this.ratingCount);
    }

    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    @Import(name="ratingHistogram")
    private @Nullable Output<List<Integer>> ratingHistogram;

    /**
     * @return List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    public Optional<Output<List<Integer>>> ratingHistogram() {
        return Optional.ofNullable(this.ratingHistogram);
    }

    private GoogleCloudRetailV2RatingArgs() {}

    private GoogleCloudRetailV2RatingArgs(GoogleCloudRetailV2RatingArgs $) {
        this.averageRating = $.averageRating;
        this.ratingCount = $.ratingCount;
        this.ratingHistogram = $.ratingHistogram;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2RatingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2RatingArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2RatingArgs();
        }

        public Builder(GoogleCloudRetailV2RatingArgs defaults) {
            $ = new GoogleCloudRetailV2RatingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param averageRating The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder averageRating(@Nullable Output<Double> averageRating) {
            $.averageRating = averageRating;
            return this;
        }

        /**
         * @param averageRating The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder averageRating(Double averageRating) {
            return averageRating(Output.of(averageRating));
        }

        /**
         * @param ratingCount The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder ratingCount(@Nullable Output<Integer> ratingCount) {
            $.ratingCount = ratingCount;
            return this;
        }

        /**
         * @param ratingCount The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder ratingCount(Integer ratingCount) {
            return ratingCount(Output.of(ratingCount));
        }

        /**
         * @param ratingHistogram List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
         * 
         * @return builder
         * 
         */
        public Builder ratingHistogram(@Nullable Output<List<Integer>> ratingHistogram) {
            $.ratingHistogram = ratingHistogram;
            return this;
        }

        /**
         * @param ratingHistogram List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
         * 
         * @return builder
         * 
         */
        public Builder ratingHistogram(List<Integer> ratingHistogram) {
            return ratingHistogram(Output.of(ratingHistogram));
        }

        /**
         * @param ratingHistogram List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
         * 
         * @return builder
         * 
         */
        public Builder ratingHistogram(Integer... ratingHistogram) {
            return ratingHistogram(List.of(ratingHistogram));
        }

        public GoogleCloudRetailV2RatingArgs build() {
            return $;
        }
    }

}
