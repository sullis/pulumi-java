// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFeedbackMessageResult {
    /**
     * @return String content of the feedback. Maximum of 10000 characters.
     * 
     */
    private final String body;
    /**
     * @return Create time.
     * 
     */
    private final String createTime;
    /**
     * @return The image storing this feedback if the feedback is an image representing operator&#39;s comments.
     * 
     */
    private final String image;
    /**
     * @return Name of the feedback message in a feedback thread. Format: &#39;project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}&#39;
     * 
     */
    private final String name;
    private final GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata;
    private final GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata;

    @CustomType.Constructor
    private GetFeedbackMessageResult(
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operatorFeedbackMetadata") GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata,
        @CustomType.Parameter("requesterFeedbackMetadata") GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata) {
        this.body = body;
        this.createTime = createTime;
        this.image = image;
        this.name = name;
        this.operatorFeedbackMetadata = operatorFeedbackMetadata;
        this.requesterFeedbackMetadata = requesterFeedbackMetadata;
    }

    /**
     * @return String content of the feedback. Maximum of 10000 characters.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return Create time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The image storing this feedback if the feedback is an image representing operator&#39;s comments.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return Name of the feedback message in a feedback thread. Format: &#39;project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}&#39;
     * 
     */
    public String name() {
        return this.name;
    }
    public GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata() {
        return this.operatorFeedbackMetadata;
    }
    public GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata() {
        return this.requesterFeedbackMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeedbackMessageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private String createTime;
        private String image;
        private String name;
        private GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata;
        private GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFeedbackMessageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.createTime = defaults.createTime;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.operatorFeedbackMetadata = defaults.operatorFeedbackMetadata;
    	      this.requesterFeedbackMetadata = defaults.requesterFeedbackMetadata;
        }

        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operatorFeedbackMetadata(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse operatorFeedbackMetadata) {
            this.operatorFeedbackMetadata = Objects.requireNonNull(operatorFeedbackMetadata);
            return this;
        }
        public Builder requesterFeedbackMetadata(GoogleCloudDatalabelingV1beta1RequesterFeedbackMetadataResponse requesterFeedbackMetadata) {
            this.requesterFeedbackMetadata = Objects.requireNonNull(requesterFeedbackMetadata);
            return this;
        }        public GetFeedbackMessageResult build() {
            return new GetFeedbackMessageResult(body, createTime, image, name, operatorFeedbackMetadata, requesterFeedbackMetadata);
        }
    }
}
