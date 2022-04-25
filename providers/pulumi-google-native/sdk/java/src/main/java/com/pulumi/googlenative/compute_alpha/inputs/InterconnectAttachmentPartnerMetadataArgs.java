// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Informational metadata about Partner attachments from Partners to display to customers. These fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER attachments.
 * 
 */
public final class InterconnectAttachmentPartnerMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectAttachmentPartnerMetadataArgs Empty = new InterconnectAttachmentPartnerMetadataArgs();

    /**
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner&#39;s portal. For instance &#34;Chicago 1&#34;. This value may be validated to match approved Partner values.
     * 
     */
    @Import(name="interconnectName")
    private @Nullable Output<String> interconnectName;

    /**
     * @return Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner&#39;s portal. For instance &#34;Chicago 1&#34;. This value may be validated to match approved Partner values.
     * 
     */
    public Optional<Output<String>> interconnectName() {
        return Optional.ofNullable(this.interconnectName);
    }

    /**
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * 
     */
    @Import(name="partnerName")
    private @Nullable Output<String> partnerName;

    /**
     * @return Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * 
     */
    public Optional<Output<String>> partnerName() {
        return Optional.ofNullable(this.partnerName);
    }

    /**
     * URL of the Partner&#39;s portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * 
     */
    @Import(name="portalUrl")
    private @Nullable Output<String> portalUrl;

    /**
     * @return URL of the Partner&#39;s portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * 
     */
    public Optional<Output<String>> portalUrl() {
        return Optional.ofNullable(this.portalUrl);
    }

    private InterconnectAttachmentPartnerMetadataArgs() {}

    private InterconnectAttachmentPartnerMetadataArgs(InterconnectAttachmentPartnerMetadataArgs $) {
        this.interconnectName = $.interconnectName;
        this.partnerName = $.partnerName;
        this.portalUrl = $.portalUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectAttachmentPartnerMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectAttachmentPartnerMetadataArgs $;

        public Builder() {
            $ = new InterconnectAttachmentPartnerMetadataArgs();
        }

        public Builder(InterconnectAttachmentPartnerMetadataArgs defaults) {
            $ = new InterconnectAttachmentPartnerMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interconnectName Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner&#39;s portal. For instance &#34;Chicago 1&#34;. This value may be validated to match approved Partner values.
         * 
         * @return builder
         * 
         */
        public Builder interconnectName(@Nullable Output<String> interconnectName) {
            $.interconnectName = interconnectName;
            return this;
        }

        /**
         * @param interconnectName Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner&#39;s portal. For instance &#34;Chicago 1&#34;. This value may be validated to match approved Partner values.
         * 
         * @return builder
         * 
         */
        public Builder interconnectName(String interconnectName) {
            return interconnectName(Output.of(interconnectName));
        }

        /**
         * @param partnerName Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(@Nullable Output<String> partnerName) {
            $.partnerName = partnerName;
            return this;
        }

        /**
         * @param partnerName Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(String partnerName) {
            return partnerName(Output.of(partnerName));
        }

        /**
         * @param portalUrl URL of the Partner&#39;s portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
         * 
         * @return builder
         * 
         */
        public Builder portalUrl(@Nullable Output<String> portalUrl) {
            $.portalUrl = portalUrl;
            return this;
        }

        /**
         * @param portalUrl URL of the Partner&#39;s portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
         * 
         * @return builder
         * 
         */
        public Builder portalUrl(String portalUrl) {
            return portalUrl(Output.of(portalUrl));
        }

        public InterconnectAttachmentPartnerMetadataArgs build() {
            return $;
        }
    }

}
