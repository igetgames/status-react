(ns status-im.extensions.ui.styles
  (:require [status-im.ui.components.colors :as colors])
  (:require-macros [status-im.utils.styles :refer [defstyle]]))

(def wrapper
  {:flex             1
   :background-color colors/white})

(defn mailserver-icon [connected?]
  {:width            40
   :height           40
   :border-radius    20
   :background-color (if connected?
                       colors/blue
                       colors/black-transparent)
   :align-items      :center
   :justify-content  :center})

(def empty-list
  {:text-align :center})